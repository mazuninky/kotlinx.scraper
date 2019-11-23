plugins {
    id("org.jetbrains.kotlin.multiplatform") version "1.3.60"
}

kotlin {
    jvm {
        val main by compilations.getting {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
    }
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(kotlin("stdlib-common"))
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core-common:1.3.2")
                implementation("io.ktor:ktor-client-core:1.2.6")
            }
        }

        val jvmMain by getting {
            dependencies {
                implementation(kotlin("stdlib-jdk8"))
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.2")
                implementation("io.ktor:ktor-client-cio:1.2.6")
            }
        }
    }
}

repositories {
    mavenCentral()
    jcenter()
}
