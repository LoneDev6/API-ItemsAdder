# ✨ ItemsAdder - API
This repository only serves the point of providing access to the method signatures of ItemsAdder's Java API.<br>
**This repository does NOT contain the source code of ItemsAdder, to test and use this, you will still require a copy of [ItemsAdder](https://www.spigotmc.org/resources/itemsadder.73355/)!**<br>

<hr>
<h3 align="center">
<a href="https://itemsadder.plugin.ga/developers/java-api">☕ Java documentation</a> | <a href="https://itemsadder.plugin.ga/developers/skript-api">📓 Skript documentation</a>
</h3>
<hr>

## 📦 Packages
You can find an overview of all packages here:<br>
https://github.com/LoneDev6/ItemsAdder-API/packages/

Alternatively you can directly reference this library using [Maven](#developer-reference-maven) or [Gradle](#developer-reference-gradle) by following the instructions outlined below.

### Developer reference (Maven)
To build your project against this library, simply include this in your `pom.xml`:

In your **<repositories>** section:
```xml
<repository>
    <id>itemsadder-repo</id>
    <url>https://maven.pkg.github.com/LoneDev6/ItemsAdder-API</url>
</repository>
```

In your **<dependencies>** section (Replace `VERSION` with the [latest release](https://github.com/LoneDev6/ItemsAdder-API/packages?ecosystem=maven) of this package):
```xml
<dependency>
    <groupId>dev.lone</groupId>
    <artifactId>itemsadder-api</artifactId>
    <version>VERSION</version>
    <scope>provided</scope>
</dependency>
```

### Developer reference (Gradle)
Repository:
```
repositories {
    maven {
        url 'https://maven.pkg.github.com/LoneDev6/ItemsAdder-API'
    }
}
```

Artifact (Replace `VERSION` with the latest release of this repository):
```
dependencies {
    implementation 'dev.lone:itemsadder-api:VERSION'
}
```
