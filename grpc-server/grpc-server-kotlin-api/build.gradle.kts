import com.google.protobuf.gradle.id
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("com.google.protobuf") version "0.9.4"
    id( "idea")
    kotlin("jvm") version "1.9.22"
}


java {
    sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
    mavenCentral()
    google()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("io.grpc:grpc-protobuf")
    implementation("io.grpc:grpc-stub")
    if (JavaVersion.current().isJava9Compatible()) {
        // Workaround for @javax.annotation.Generated
        // see: https://github.com/grpc/grpc-java/issues/3633
        compileOnly ("org.apache.tomcat:annotations-api:6.0.53")
        annotationProcessor ("jakarta.annotation:jakarta.annotation-api")
    }

    compileOnly("javax.annotation:javax.annotation-api:1.3.2")
    api("com.google.protobuf:protobuf-java-util:4.32.0")
    implementation("io.grpc:grpc-all:1.75.0")
    api("io.grpc:grpc-kotlin-stub:1.4.3")
    implementation("io.grpc:protoc-gen-grpc-kotlin:1.4.3")

    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.10.2")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs += "-Xjsr305=strict"
        jvmTarget = "17"
    }
}

protobuf {
    protoc{
        artifact = "com.google.protobuf:protoc:4.31.0"
    }
    generatedFilesBaseDir = "$projectDir/src/generated"
    tasks.clean {
        delete ("$projectDir/src/generated")
    }
    plugins {
        id("grpc"){
            artifact = "io.grpc:protoc-gen-grpc-java:1.73.0"
        }
        id("grpckt") {
            artifact = "io.grpc:protoc-gen-grpc-kotlin:1.4.3:jdk8@jar"
        }
    }
    generateProtoTasks {
        all().forEach {
            it.plugins {
                id("grpc")
                id("grpckt")
            }
        }
    }
}

idea {
    module {
        sourceDirs.plusAssign(file("src/generated/main/grpckt"))
        sourceDirs.plusAssign(file("src/generated/main/java"))
        sourceDirs.plusAssign(file("src/generated/main/grpc"))
        generatedSourceDirs.plusAssign(file("src/generated/main/java"))
        generatedSourceDirs.plusAssign(file("src/generated/main/grpckt"))
        generatedSourceDirs.plusAssign(file("src/generated/main/grpc"))
    }
}