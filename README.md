# winsparkle-java
![winsparkle-java](winsparkle-java.svg)

[![License](https://img.shields.io/github/license/purejava/winsparkle-java.svg)](https://github.com/purejava/winsparkle-java/blob/master/LICENSE)
[![Maven Central](https://img.shields.io/maven-central/v/org.purejava/winsparkle-java.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22org.purejava%22%20AND%20a:winsparkle-java*)

Java bindings for WinSparkle in 100% pure Java

# Requires
Java 19 (preview)
- due to the use of the new Foreign Function & Memory API

# Usage
The bindings come in two flavors:

## Dependency *including* WinSparkle.dll 0.8.0
```java
<dependency>
    <groupId>org.purejava</groupId>
    <artifactId>winsparkle-java</artifactId>
    <version>1.2.0</version>
</dependency>
```
WinSparkle.dll gets loaded by the bindings. You don't need to worry about that.

## Dependency *excluding* WinSparkle.dll 0.8.0
```java
<dependency>
    <groupId>org.purejava</groupId>
    <artifactId>winsparkle-java-without-dll</artifactId>
    <version>1.2.0</version>
</dependency>
```
You need to place WinSparkle.dll in the Java library path yourself and the bindings take care of loading the dll from there.

All of the API function names are the same as the [original WinSparkle project](https://github.com/vslavik/winsparkle).

## Initialize WinSparkle
Your app must call `win_sparkle_init()` somewhere to initialize WinSparkle and perform the check. The best place to do it is as soon after startup as possible, but no sooner than the app's main window is shown. WinSparkle may show its UI soon after this call, so it’s important that the user can immediately associate its updates popup window with your app.

Before calling `win_sparkle_init()`, you must set the appcast URL with `win_sparkle_set_appcast_url()`:
```java
// Initialize WinSparkle as soon as the app itself is initialized, right
// before entering the event loop:
winsparkle_h.win_sparkle_set_appcast_url("https://winsparkle.org/example/appcast.xml");
winsparkle_h.win_sparkle_init();
```

Finally, you should shut WinSparkle down cleanly when the app exits:
```java
winsparkle_h.win_sparkle_cleanup();
```

## A note on callbacks
WinSparkle provides a lot of useful callbacks. Using them requires a shared session and to allocate the memory for a callback (aka setting the pointer to a function that is executed as the callback) in the shared session:
```java
// Declare a variable for the session
private MemorySession session;

// Open the session on initializing WinSparkle
session = MemorySession.openShared();

// Pass the session to the static method in MemoryAllocator when memory for a callback is allocated
winsparkle_h.win_sparkle_set_did_find_update_callback(MemoryAllocator.ALLOCATE_CALLBACK_FOR(yourCallback, session));

// Close the session when WinSparkle is shut down
session.close();
```

# Copyright
Copyright (C) 2022-2023 Ralph Plawetzki

The winsparkle-java logo is made from [Icon Fonts](http://www.onlinewebfonts.com/icon) and is licensed by CC BY 3.0