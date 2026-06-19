# 通知历史

一键打开 Android 系统「通知历史」设置页面的工具应用。

## 功能

- 点击按钮直达系统通知历史设置页，查看撤回内容
- 关于页面展示应用信息与使用说明

## 要求

- Android 11（API 30）及以上
- 系统需内置通知历史功能（Android 11+ 原生支持）


## 构建

使用 Android Studio 打开项目根目录，Sync 后直接 Run。

或命令行构建：

```bash
# 需要设置 JAVA_HOME 和 ANDROID_HOME
./gradlew assembleRelease
```

输出 APK：`app/build/outputs/apk/release/app-release.apk`

### 国内网络环境（不保证能用）

Gradle 下载源已配置腾讯云镜像，依赖仓库配置了阿里云镜像，见：

- `gradle/wrapper/gradle-wrapper.properties` — Gradle 发行版下载源
- `settings.gradle.kts` — 依赖与插件仓库源

## 技术栈

| 项目 | 选型 |
|------|------|
| 语言 | Kotlin |
| UI | Jetpack Compose + Material Design 3 |
| 导航 | Navigation Compose |
| 最低版本 | Android 11 (API 30) |
| 目标版本 | Android 14 (API 34) |
| 构建 | Gradle 8.5 + AGP 8.2.2 |

## 项目结构

```
app/src/main/java/com/notifhistory/app/
├── MainActivity.kt          # 入口 + 路由
└── ui/
    ├── theme/
    │   ├── Color.kt         # 颜色定义
    │   ├── Theme.kt         # Material 3 主题
    │   └── Type.kt          # 字体排版
    └── screens/
        ├── MainScreen.kt    # 首页
        └── AboutScreen.kt   # 关于页面
```

## 许可

MIT License

Copyright (c) 2026 123zhuzhu61（拿稳时光）

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
