dependencies{
    implementation("org.springframework.boot:spring-boot-starter-web")
}

tasks.withType<org.springframework.boot.gradle.tasks.bundling.BootJar> {
    enabled = true
}

tasks.withType<Jar> {
    enabled = false
}
