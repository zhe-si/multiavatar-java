package com.zhesi.multiavatar;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

/**
 * <b>MultiavatarGenTest</b>
 * <p>
 * MultiavatarGen 测试类
 * </p>
 *
 * @author lq
 * @version 1.0
 */
class MultiavatarGenTest {

    private static final String TEST_PACKAGE = "./test/";

    @Test
    public void buildIndex() throws IOException {
        String html = "<!doctype html><html> <head> <meta charset=\"utf-8\"> <meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\"> <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\"> <title>Multiavatar - All 48 Initial Avatar Designs</title> <style>body, html{width:100%; height:100%;}body{background-color: #fff; overflow-x: hidden; padding:0px; margin:0px;}*{box-sizing: border-box;}.container{width: 100%; height: 100%; padding: 20px;}.avatar{width: 110px; height:110px; float:left; margin: 10px;}</style> </head> <body> <div id=\"container\" class=\"container\">" +
                "<div class=\"avatar\">" +
                MultiavatarGen.genMultiavatarSvg("Starcrasher", false, Map.of(
                        "part", "00",
                        "theme", "A"
                )) +
                "</div>" +
                "<div class=\"avatar\">" +
                MultiavatarGen.genMultiavatarSvg("Starcrasher", false, Map.of(
                        "part", "00",
                        "theme", "B"
                )) +
                "</div>" +
                "<div class=\"avatar\">" +
                MultiavatarGen.genMultiavatarSvg("Starcrasher", false, Map.of(
                        "part", "00",
                        "theme", "C"
                )) +
                "</div>" +
                "<div class=\"avatar\">" +
                MultiavatarGen.genMultiavatarSvg("Starcrasher", false, Map.of(
                        "part", "01",
                        "theme", "A"
                )) +
                "</div>" +
                "<div class=\"avatar\">" +
                MultiavatarGen.genMultiavatarSvg("Starcrasher", false, Map.of(
                        "part", "01",
                        "theme", "B"
                )) +
                "</div>" +
                "<div class=\"avatar\">" +
                MultiavatarGen.genMultiavatarSvg("Starcrasher", false, Map.of(
                        "part", "01",
                        "theme", "C"
                )) +
                "</div>" +
                "<div class=\"avatar\">" +
                MultiavatarGen.genMultiavatarSvg("Starcrasher", false, Map.of(
                        "part", "02",
                        "theme", "A"
                )) +
                "</div>" +
                "<div class=\"avatar\">" +
                MultiavatarGen.genMultiavatarSvg("Starcrasher", false, Map.of(
                        "part", "02",
                        "theme", "B"
                )) +
                "</div>" +
                "<div class=\"avatar\">" +
                MultiavatarGen.genMultiavatarSvg("Starcrasher", false, Map.of(
                        "part", "02",
                        "theme", "C"
                )) +
                "</div>" +
                "<div class=\"avatar\">" +
                MultiavatarGen.genMultiavatarSvg("Starcrasher", false, Map.of(
                        "part", "03",
                        "theme", "A"
                )) +
                "</div>" +
                "<div class=\"avatar\">" +
                MultiavatarGen.genMultiavatarSvg("Starcrasher", false, Map.of(
                        "part", "03",
                        "theme", "B"
                )) +
                "</div>" +
                "<div class=\"avatar\">" +
                MultiavatarGen.genMultiavatarSvg("Starcrasher", false, Map.of(
                        "part", "03",
                        "theme", "C"
                )) +
                "</div>" +
                "<div class=\"avatar\">" +
                MultiavatarGen.genMultiavatarSvg("Starcrasher", false, Map.of(
                        "part", "04",
                        "theme", "A"
                )) +
                "</div>" +
                "<div class=\"avatar\">" +
                MultiavatarGen.genMultiavatarSvg("Starcrasher", false, Map.of(
                        "part", "04",
                        "theme", "B"
                )) +
                "</div>" +
                "<div class=\"avatar\">" +
                MultiavatarGen.genMultiavatarSvg("Starcrasher", false, Map.of(
                        "part", "04",
                        "theme", "C"
                )) +
                "</div>" +
                "<div class=\"avatar\">" +
                MultiavatarGen.genMultiavatarSvg("Starcrasher", false, Map.of(
                        "part", "05",
                        "theme", "A"
                )) +
                "</div>" +
                "<div class=\"avatar\">" +
                MultiavatarGen.genMultiavatarSvg("Starcrasher", false, Map.of(
                        "part", "05",
                        "theme", "B"
                )) +
                "</div>" +
                "<div class=\"avatar\">" +
                MultiavatarGen.genMultiavatarSvg("Starcrasher", false, Map.of(
                        "part", "05",
                        "theme", "C"
                )) +
                "</div>" +
                "<div class=\"avatar\">" +
                MultiavatarGen.genMultiavatarSvg("Starcrasher", false, Map.of(
                        "part", "06",
                        "theme", "A"
                )) +
                "</div>" +
                "<div class=\"avatar\">" +
                MultiavatarGen.genMultiavatarSvg("Starcrasher", false, Map.of(
                        "part", "06",
                        "theme", "B"
                )) +
                "</div>" +
                "<div class=\"avatar\">" +
                MultiavatarGen.genMultiavatarSvg("Starcrasher", false, Map.of(
                        "part", "06",
                        "theme", "C"
                )) +
                "</div>" +
                "<div class=\"avatar\">" +
                MultiavatarGen.genMultiavatarSvg("Starcrasher", false, Map.of(
                        "part", "07",
                        "theme", "A"
                )) +
                "</div>" +
                "<div class=\"avatar\">" +
                MultiavatarGen.genMultiavatarSvg("Starcrasher", false, Map.of(
                        "part", "07",
                        "theme", "B"
                )) +
                "</div>" +
                "<div class=\"avatar\">" +
                MultiavatarGen.genMultiavatarSvg("Starcrasher", false, Map.of(
                        "part", "07",
                        "theme", "C"
                )) +
                "</div>" +
                "<div class=\"avatar\">" +
                MultiavatarGen.genMultiavatarSvg("Starcrasher", false, Map.of(
                        "part", "08",
                        "theme", "A"
                )) +
                "</div>" +
                "<div class=\"avatar\">" +
                MultiavatarGen.genMultiavatarSvg("Starcrasher", false, Map.of(
                        "part", "08",
                        "theme", "B"
                )) +
                "</div>" +
                "<div class=\"avatar\">" +
                MultiavatarGen.genMultiavatarSvg("Starcrasher", false, Map.of(
                        "part", "08",
                        "theme", "C"
                )) +
                "</div>" +
                "<div class=\"avatar\">" +
                MultiavatarGen.genMultiavatarSvg("Starcrasher", false, Map.of(
                        "part", "09",
                        "theme", "A"
                )) +
                "</div>" +
                "<div class=\"avatar\">" +
                MultiavatarGen.genMultiavatarSvg("Starcrasher", false, Map.of(
                        "part", "09",
                        "theme", "B"
                )) +
                "</div>" +
                "<div class=\"avatar\">" +
                MultiavatarGen.genMultiavatarSvg("Starcrasher", false, Map.of(
                        "part", "09",
                        "theme", "C"
                )) +
                "</div>" +
                "<div class=\"avatar\">" +
                MultiavatarGen.genMultiavatarSvg("Starcrasher", false, Map.of(
                        "part", "10",
                        "theme", "A"
                )) +
                "</div>" +
                "<div class=\"avatar\">" +
                MultiavatarGen.genMultiavatarSvg("Starcrasher", false, Map.of(
                        "part", "10",
                        "theme", "B"
                )) +
                "</div>" +
                "<div class=\"avatar\">" +
                MultiavatarGen.genMultiavatarSvg("Starcrasher", false, Map.of(
                        "part", "10",
                        "theme", "C"
                )) +
                "</div>" +
                "<div class=\"avatar\">" +
                MultiavatarGen.genMultiavatarSvg("Starcrasher", false, Map.of(
                        "part", "11",
                        "theme", "A"
                )) +
                "</div>" +
                "<div class=\"avatar\">" +
                MultiavatarGen.genMultiavatarSvg("Starcrasher", false, Map.of(
                        "part", "11",
                        "theme", "B"
                )) +
                "</div>" +
                "<div class=\"avatar\">" +
                MultiavatarGen.genMultiavatarSvg("Starcrasher", false, Map.of(
                        "part", "11",
                        "theme", "C"
                )) +
                "</div>" +
                "<div class=\"avatar\">" +
                MultiavatarGen.genMultiavatarSvg("Starcrasher", false, Map.of(
                        "part", "12",
                        "theme", "A"
                )) +
                "</div>" +
                "<div class=\"avatar\">" +
                MultiavatarGen.genMultiavatarSvg("Starcrasher", false, Map.of(
                        "part", "12",
                        "theme", "B"
                )) +
                "</div>" +
                "<div class=\"avatar\">" +
                MultiavatarGen.genMultiavatarSvg("Starcrasher", false, Map.of(
                        "part", "12",
                        "theme", "C"
                )) +
                "</div>" +
                "<div class=\"avatar\">" +
                MultiavatarGen.genMultiavatarSvg("Starcrasher", false, Map.of(
                        "part", "13",
                        "theme", "A"
                )) +
                "</div>" +
                "<div class=\"avatar\">" +
                MultiavatarGen.genMultiavatarSvg("Starcrasher", false, Map.of(
                        "part", "13",
                        "theme", "B"
                )) +
                "</div>" +
                "<div class=\"avatar\">" +
                MultiavatarGen.genMultiavatarSvg("Starcrasher", false, Map.of(
                        "part", "13",
                        "theme", "C"
                )) +
                "</div>" +
                "<div class=\"avatar\">" +
                MultiavatarGen.genMultiavatarSvg("Starcrasher", false, Map.of(
                        "part", "14",
                        "theme", "A"
                )) +
                "</div>" +
                "<div class=\"avatar\">" +
                MultiavatarGen.genMultiavatarSvg("Starcrasher", false, Map.of(
                        "part", "14",
                        "theme", "B"
                )) +
                "</div>" +
                "<div class=\"avatar\">" +
                MultiavatarGen.genMultiavatarSvg("Starcrasher", false, Map.of(
                        "part", "14",
                        "theme", "C"
                )) +
                "</div>" +
                "<div class=\"avatar\">" +
                MultiavatarGen.genMultiavatarSvg("Starcrasher", false, Map.of(
                        "part", "15",
                        "theme", "A"
                )) +
                "</div>" +
                "<div class=\"avatar\">" +
                MultiavatarGen.genMultiavatarSvg("Starcrasher", false, Map.of(
                        "part", "15",
                        "theme", "B"
                )) +
                "</div>" +
                "<div class=\"avatar\">" +
                MultiavatarGen.genMultiavatarSvg("Starcrasher", false, Map.of(
                        "part", "15",
                        "theme", "C"
                )) +
                "</div>" +
                "</div><div style=\"height:40px;clear:both;\"></div></body></html>";
        Files.write(Path.of(TEST_PACKAGE + "index.html"), html.getBytes(StandardCharsets.UTF_8));
    }

    @Test
    public void buildOther() throws IOException {
        String html = "<html><head></head><body>" +
                MultiavatarGen.genMultiavatarSvg("Starcrasher", false, null) +
                "<br>" +
                MultiavatarGen.genMultiavatarSvg("Pandalion", true, null) +
                "<br>" +
                MultiavatarGen.genMultiavatarSvg("Starcrasher", false, Map.of(
                        "part", "11",
                        "theme", "C"
                )) +
                "<br>" +
                MultiavatarGen.genMultiavatarSvg("Starcrasher", false, Map.of(
                        "part", "08",
                        "theme", "C"
                )) +
                "<br>" +
                MultiavatarGen.genMultiavatarSvg("Starcrasher", false, Map.of(
                        "part", "15",
                        "theme", "B"
                )) +
                "<br>" +
                MultiavatarGen.genMultiavatarSvg("123456789", false, null) +
                "<br>" +
                "</body></html>";
        Files.write(Path.of(TEST_PACKAGE + "other.html"), html.getBytes(StandardCharsets.UTF_8));
    }

}
