<p align="center">
  <img src="https://github.com/yasan-org/para/blob/main/README.png" />
</p>

[![Build](https://github.com/yasan-org/para/workflows/Build/badge.svg)](https://github.com/yasan-org/para/actions/workflows/build.yml)
[![](https://jitpack.io/v/yasan-org/para.svg)](https://jitpack.io/#yasan-org/para)
[![](https://jitpack.io/v/yasan-org/para/month.svg)](https://jitpack.io/#yasan-org/para)

A series of [Preview Providers](https://developer.android.com/reference/kotlin/androidx/compose/ui/tooling/preview/PreviewParameter) for [Jetpack Compose](https://developer.android.com/jetpack/compose) that any app can utilize.

## Download

Para is available on [Jitpack](https://jitpack.io/#yasan-org/para):

1. Add it in your root `build.gradle` at the end of repositories:

```groovy
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}
```

2. Add the dependency:

```groovy
dependencies {
    implementation 'com.github.yasan-org:para:0.1.1'
}
```