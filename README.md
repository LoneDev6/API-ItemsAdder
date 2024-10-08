# ✨ ItemsAdder - API
This repository only serves the point of providing access to the method signatures of ItemsAdder's Java API.<br>
**This repository does NOT contain the source code of ItemsAdder, to test and use this, you will still require a copy of [ItemsAdder](https://www.spigotmc.org/resources/itemsadder.73355/)!**<br>

<hr>
<h3 align="center">
<a href="https://itemsadder.devs.beer/developers/java-api">☕ Java documentation</a> | <a href="https://lonedev6.github.io/API-ItemsAdder/">☕ JavaDocs</a>  | <a href="https://itemsadder.devs.beer/developers/skript-api">📓 Skript documentation</a>
</h3>
<hr> 

# ⚠️ Important

When you use the API it's very important to listen to the [ItemsAdderLoadDataEvent](https://github.com/LoneDev6/API-ItemsAdder/blob/master/src/main/java/dev/lone/itemsadder/api/Events/ItemsAdderLoadDataEvent.java) event in order to make sure items are correctly loaded before accessing them.
ItemsAdder loading is async, that's why.

## Developer reference (Maven)
To build your project against this library, simply include one of the following references in your `pom.xml`:

### `jitpack.io`
Add this to your **&lt;repositories&gt;** section:
```xml
<repository>
    <id>jitpack-repo</id>
    <url>https://jitpack.io</url>
</repository>
```

In your **&lt;dependencies&gt;** section (Replace `VERSION` with the [latest release](https://github.com/LoneDev6/API-ItemsAdder/packages?ecosystem=maven) of this package):
```xml
<dependency>
    <groupId>com.github.LoneDev6</groupId>
    <artifactId>api-itemsadder</artifactId>
    <version>3.6.1</version>
    <scope>provided</scope>
</dependency>
```

#### LoneLibs

This API requires LoneLibs to be added to your dependencies.

#### Add it using my repository
```xml
 <repository>
    <id>matteodev</id>
    <url>https://www.matteodev.it/spigot/public/maven/</url>
</repository>
```
```xml
<dependency>
    <groupId>dev.lone</groupId>
    <artifactId>LoneLibs</artifactId>
    <version>1.0.58</version>
    <scope>provided</scope>
</dependency>
```

### Alternative: Add it using the JAR
```xml
<dependency>
    <groupId>libs</groupId>
    <artifactId>LoneLibs</artifactId>
    <version>1.0</version>
    <scope>system</scope>
    <systemPath>path_to_your_jar/LoneLibs.jar</systemPath>
</dependency>
```


## Developer reference (Gradle)

### `jitpack.io`
Repository:
```gradle
repositories {
    maven {
        url 'https://jitpack.io'
    }
}
```

Artifact (Replace `VERSION` with the [latest release](https://github.com/LoneDev6/API-ItemsAdder/packages?ecosystem=maven) of this package):
```gradle
dependencies {
    compileOnly 'com.github.LoneDev6:API-ItemsAdder:3.6.1'
}
```

---

# Examples

## GUI
https://github.com/LoneDev6/API-ItemsAdder-Example-GUI

## Complex HUDs usage (ServerMonitor)
https://github.com/LoneDev6/API-ItemsAdder-Example-ServerMonitor
