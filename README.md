# Multiavatar for Java #

<img src="https://raw.githubusercontent.com/multiavatar/Multiavatar/main/logo.png?v=001" width="65">

[Multiavatar](https://multiavatar.com) is a multicultural avatar generator.

In total, it is possible to generate **12,230,590,464** cryptographically unique avatars.

Initially coded in JavaScript, this version of Multiavatar is re-created in Java.

For more details about the Multiavatar Generator, please refer to the readme available in the JS [repository](https://github.com/multiavatar/Multiavatar).

为您的网站、社区或应用程序提供海量基于名称的头像。Multiavatar 在 Java 语言的非官方实现。

### Installation ###

Install Multiavatar with download jar:

- Download release jar and import in project.
- If use maven, you can copy `multiavatar-1.0.0.jar` into `lib` folder of project directory and add this config in `pom.xml`.
  ```
  <dependency>
      <groupId>com.zhesi</groupId>
      <artifactId>multiavatar</artifactId>
      <version>1.0.0</version>
      <scope>system</scope>
      <systemPath>${project.basedir}/lib/multiavatar-1.0.0.jar</systemPath>
  </dependency>
  ```

### Usage ###

```
String avatarSvg = MultiavatarGen.genMultiavatarSvg("Binx Bond", false, null);
Files.write(Path.of("targetpath/xxx.svg"), avatarSvg.getBytes(StandardCharsets.UTF_8));
```

Is equal to this.

```
byte[] avatarSvgBytes = MultiavatarGen.genAvatarSvg("Binx Bond");
Files.write(Path.of("targetpath/xxx.svg"), avatarSvgBytes);
```

For advanced usage, pass boolean `true` as the second parameter if you wish to generate an avatar without the environment part.

Pass a dictionary as the third parameter to generate a specific avatar version.

```
String avatarSvg = MultiavatarGen.genMultiavatarSvg("Binx Bond", true, Map.of(
        "part", "11",
        "theme", "C"
));
```

If you want to generate a png type avatar picture, you can use the `batik` library of apache to convert the svg picture, you can refer to the following methods.

First, introduce the batik dependency.

```
<dependency>
    <groupId>org.apache.xmlgraphics</groupId>
    <artifactId>batik-all</artifactId>
    <version>1.16</version>
</dependency>
```

You can refer to the tool class for converting svg to png images below.

```java
/**
 * <b>SvgHelper</b>
 * <p>
 * svg 工具类
 * - svg 转 png
 * </p>
 *
 * @author zhe-si
 * @version 1.0
 */
public class SvgHelper {
  public static byte[] convertSvgFile2Png(byte[] svgBytes) {
    ByteArrayInputStream svgInStream = new ByteArrayInputStream(svgBytes);
    byte[] bytes = convertSvgFile2Png(svgInStream);
    try {
      svgInStream.close();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
    return bytes;
  }

  public static byte[] convertSvgFile2Png(InputStream svgInStream) {
    ByteArrayOutputStream pngOutStream = new ByteArrayOutputStream();
    convert2Png(svgInStream, pngOutStream);
    byte[] byteArray = pngOutStream.toByteArray();
    try {
      pngOutStream.close();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
    return byteArray;
  }

  public static void convert2Png(InputStream svgInStream, OutputStream pngOutStream) {
    Transcoder tr = new PNGTranscoder();
    try {
      TranscoderInput input = new TranscoderInput(svgInStream);
      TranscoderOutput output = new TranscoderOutput(pngOutStream);
      tr.transcode(input, output);
    } catch (TranscoderException e) {
      throw new RuntimeException(e);
    }
  }
}
```

A complete example of generating png is as follows.

```
byte[] avatarSvgBytes = MultiavatarGen.genAvatarSvg("Binx Bond");
byte[] avatarPngBytes = SvgHelper.convertSvgFile2Png(avatarSvgBytes);
```


### Testing ###

To catch bugs, the representation of tests should be visual because not all bugs have programmatic errors. For example, if an equal length color array is mixed, or a double semicolon appears in a color string, in such cases an error is not thrown, but the visual representation of avatar(-s) becomes broken.

There are two types of tests, currently available in `index.html` and `other.html` files. Simply open these files in your browser. Build these files by running the Python build scripts in the `tests` folder.

In the `index.html` file, visually presented are all 48 base versions or avatars. If all 48 base versions are good, then it means that all 12 billion are also good, because the 12 billion are constructed from different parts of the 48 base versions. All avatars in this file should look exactly the same as in the JavaScript repository's `\svg\index.html` file.

In the `other.html` file, additional various tests are performed to test different approaches how to generate avatars, specific avatar versions, or some repository-specific cases.


### API ###

Alternatively to this Python script, you can use Multiavatar through the web API.

To get an avatar as SVG code, add the avatar's ID to the URL:

```
https://api.multiavatar.com/Binx Bond
```

To get an avatar as SVG file, add .svg to the end of the URL:

```
https://api.multiavatar.com/Binx Bond.svg
```
To get an avatar as PNG file, add .png to the end of the URL:

```
https://api.multiavatar.com/Binx Bond.png
```


### License ###

You can use Multiavatar for free, as long as the conditions described in the [LICENSE](https://multiavatar.com/license) are followed.


### Screenshots ###

<img src="https://multiavatar.com/press/img/screenshots/screenshot-02.png?v=001">

<img src="https://multiavatar.com/press/img/screenshots/screenshot-03.png?v=001">

<img src="https://multiavatar.com/press/img/screenshots/screenshot-09.png?v=001">

<img src="https://multiavatar.com/press/img/screenshots/screenshot-10.png?v=001">


### More info ###

For additional information and extended functionality, visit the [multiavatar.com](https://multiavatar.com) web-app.

The app is based on static html for the home page, and on Laravel 8 + Vue.js for extended functionality, including the web store.

The product mockup generator for the [Merch Maker](https://multiavatar.com/merch-maker) is based on the ImageMagick PHP library.