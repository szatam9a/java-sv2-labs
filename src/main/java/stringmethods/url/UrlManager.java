package stringmethods.url;

import javax.swing.*;
import java.util.Locale;

public class UrlManager {
    private String protocol;
    private String host;
    private String path;
    private String query;
    private Integer port;
    private String url;

    public UrlManager(String url) {
        this.url = url;
        this.protocol = getProtocolFromURL();
    }
//        protocol://host:port/path?query-string,
//    protocol: https (kötelező)
//    host: earthquake.usgs.gov (kötelező)
//    port: (nincs megadva)
//    path: fdsnws/event/1/query
//    query-stringként átadott adatok:
//    format = geojson
//             starttime = 2014-01-01
//             endtime = 2014-01-02


    private String getProtocolFromURL() {

        String result;
        int indexOfProtocol = url.indexOf("://");

        result = url.substring(0, indexOfProtocol);
        return result.toLowerCase(Locale.ROOT);
    }

    private String getHostFromURL() {

        String result;
        int protocol = url.indexOf("://")+3;

        if (!(url.indexOf(":",protocol)==-1)) {
            result = url.substring(protocol + 3, url.indexOf(":", protocol  ));
        } else {
            result = url.substring(protocol + 3, url.indexOf("/", protocol ));
        }
        return result.toLowerCase(Locale.ROOT);
    }

    private Integer getPortFromURL() {
        String result;
        int protocol = url.indexOf(":", url.indexOf("://") + 3);
        if (!(protocol==-1)) {
            result = url.substring(protocol + 1, url.indexOf("/", protocol + 1));
            return Integer.parseInt(result);
        } else return null;
    }

    private String getPathFromURL() {
        String result="";
        int protocol = url.indexOf("://");


    return result;}
//
//    private String getQueryFromURL() {
//
//    }
//
//    public boolean hasProperty(String key) {
//
//    }
//
//    public String getProperty(String key) {
//
//    }

    public String getProtocol() {
        return protocol;
    }

    public Integer getPort() {
        return port;
    }

    public String getHost() {
        return host;
    }

    public String getPath() {
        return path;
    }

    public static void main(String[] args) {
        String url = "https://earthquake.usgs.gov/?format=geojson&starttime=2014-01-01&endtime=2014-01-02";
        UrlManager urlManager = new UrlManager(url);
        System.out.println(urlManager.getHostFromURL());
        System.out.println(urlManager.getProtocolFromURL());
        System.out.println(urlManager.getPortFromURL());

    }
}
