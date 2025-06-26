# 🚀 GraalVM Native Image

GraalVM Native Image allows you to create standalone executables by compiling Java applications ahead-of-time (AOT). These executables typically have a smaller memory footprint and significantly faster startup times compared to traditional JVM applications.

---

## ✅ Advantages

- ⚡ **Faster startup time**
- 🧠 **Lower memory consumption**
- 📦 **No need for a JVM at runtime — single executable file**

---

## 📌 When to Use It

Native Images are ideal for:

- **Function-as-a-Service (FaaS)** / **Serverless functions**
- Applications that:
  - Handle single, short-lived tasks
  - Do not require constant uptime
  - Are deployed on platforms like AWS Lambda

---

## 🚫 When *Not* to Use It

Avoid using GraalVM Native Image in the following scenarios:

- 🌐 **High-traffic web applications** (due to limitations in dynamic features)
- 🔁 **Applications with frequent deployments** (AOT compilation time is long)
- 🧩 **Large monolithic applications** (image size and build time increase significantly)

---

## 🔧 Requirements

Before you can build a native image, ensure the following are installed:

- ✅ [GraalVM](https://www.graalvm.org/) and set in your system's `PATH`
- ✅ `native-image` installed via GraalVM (`gu install native-image`)
- ✅ [Visual Studio C++ Build Tools](https://visualstudio.microsoft.com/visual-cpp-build-tools/)
- ✅ Permission to run Visual Studio environment setup via terminal:
  
  In IntelliJ terminal or CMD, run:
  
  ```bash
  call "C:\Program Files (x86)\Microsoft Visual Studio\2022\BuildTools\VC\Auxiliary\Build\vcvarsall.bat" x64


### How to install and run application? ###
1. Clone the project and execute this command that creates executable in target:
```bash
./mvnw -Pnative native:compile -DskipTest
```
Building will be longer as of AOT - ahead of time compilation
3. Run the executable:
```bash
./target/graalVM 
```
And you will be able to see how fast it runns. We can do the same excersize with building the app with maven and run with:
```bash
java -jar /path/to/jar/file.jar
```
The difference is obvious!



