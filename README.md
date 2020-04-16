[![](https://jitci.com/gh/arturogutierrez/dagger2-android-shaded/svg)](https://jitci.com/gh/arturogutierrez/dagger2-android-shaded)

# Dagger 2 Android Shaded 🕶

1. Add this to your build:

```groovy
repositories {
  maven { url "https://jitpack.io" }
}

dependencies {
  implementation 'com.github.arturogutierrez.dagger2-android-shaded:dagger2-android-shaded-library:2.27'
  implementation 'com.github.arturogutierrez.dagger2-android-shaded:dagger2-android-support-shaded:2.27'
  kapt 'com.github.arturogutierrez.dagger2-android-shaded:dagger2-shaded-compiler:2.27'
  kapt 'com.github.arturogutierrez.dagger2-android-shaded:dagger2-android-processor-shaded:2.27'
}
```

2. Play with Dagger 1 and Dagger 2 at the same time:

```kotlin
class MyClass @Inject @Inject2 constructor() {
  ...
}
```

3. ???

4. Profit.

---

📚 You can read more about it here:
https://proandroiddev.com/dagger-1-and-dagger-2-together-917f082b3dd9

➕And you might also be interested in this:
https://github.com/blinkist/AssistedInject

## Notes

Based on [dagger2-shaded](https://github.com/blinkist/dagger2-shaded)
