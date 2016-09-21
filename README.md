# android\-wgallery

根据 [[GitHub: EcoGallery]](https://github.com/falnatsheh/EcoGallery) 实现

自定义的 Gallery，可以实现下图的效果：

![效果图][1]

## Gradle

[![](https://www.jitpack.io/v/wuzhendev/android-wgallery.svg)](https://www.jitpack.io/#wuzhendev/android-wgallery)

``` groovy
repositories {
    maven {
        url "https://www.jitpack.io"
    }
}

dependencies {
    compile 'com.github.wuzhendev:android-wgallery:x.y.z'
}
```

## Attrs

``` xml
<!-- Item的对齐方式 -->
<attr name="wGallery_gravity" format="integer" />

<!-- 切换到选中的Item动画的时长 -->
<attr name="wGallery_animationDuration" format="integer" />

<!-- 未选中的Item的透明度 -->
<attr name="wGallery_unselectedAlpha" format="float" />

<!-- Item 之间的间距 -->
<attr name="wGallery_spacing" format="dimension" />

<!-- 选中的Item缩放的倍数 -->
<attr name="wGallery_selectedScale" format="float" />

<!-- 选中的Item缩放时的标准点 -->
<attr name="wGallery_scalePivot" format="integer">

    <!-- 选中的Item以中心点进行缩放 -->
    <enum name="center" value="0" />

    <!-- 选中的Item以顶部中心点进行缩放 -->
    <enum name="top" value="1" />

    <!-- 选中的Item以底部中心点进行缩放 -->
    <enum name="bottom" value="2" />
</attr>
```

## Sample

[Sample sources][2]

[Sample APK][3]

## License

```
Copyright 2016 wuzhen

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```

[1]: ./assets/1.gif
[2]: ./samples
[3]: ./assets/WGallery_Demo_v1.0.0.apk
