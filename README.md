# ItemsAdder - API
This repository only serves the point of providing access to the method signatures of ItemsAdder's Java API.<br>
**This repository does NOT contain the source code of ItemsAdder, to test and use this, you will still require a copy of [ItemsAdder](https://www.spigotmc.org/resources/itemsadder.73355/)!**<br>

<hr>
<h3 align="center">
<a href="https://itemsadder.devs.beer/developers/java-api">☕ Java documentation</a> | <a href="https://lonedev6.github.io/API-ItemsAdder/">☕ JavaDocs</a>  | <a href="https://itemsadder.devs.beer/developers/skript-api">📓 Skript documentation</a>
</h3>
<hr> 

> [!WARNING]  
> When you use the API it's very important to listen to the [ItemsAdderLoadDataEvent](https://github.com/LoneDev6/API-ItemsAdder/blob/master/src/main/java/dev/lone/itemsadder/api/Events/ItemsAdderLoadDataEvent.java) event in order to make sure items are correctly loaded before accessing them.
> ItemsAdder loading is async, that's why.


## ItemsAdder
![ItemsAdder API](https://img.shields.io/badge/dynamic/xml?url=https%3A%2F%2Frepo1.maven.org%2Fmaven2%2Fbeer%2Fdevs%2Fitemsadder-api%2Fmaven-metadata.xml&query=%2Fmetadata%2Fversioning%2Flatest&label=&color=blue)

To build your project against this library, simply include one of the following references in your `pom.xml`:

In your **&lt;dependencies&gt;** section (To find the latest version check the badge above):

### Maven
```xml
<dependency>
    <groupId>beer.devs</groupId>
    <artifactId>itemsadder-api</artifactId>
    <!-- Replace {version} with the latest version -->
    <version>{version}</version>
    <scope>provided</scope>
</dependency>
```

### Gradle
```kotlin
dependencies {
    compileOnly("beer.devs:itemsadder-api:{version}")
}
```

---

## Examples

## GUI
https://github.com/LoneDev6/API-ItemsAdder-Example-GUI

## Complex HUDs usage (ServerMonitor)
https://github.com/LoneDev6/API-ItemsAdder-Example-ServerMonitor
