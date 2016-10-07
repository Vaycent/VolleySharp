# VolleySharp
This is the volley with okhttp as its underlying frame, and makes the volley more easy to use in project.



## How to Use

First, import this dependence

```gradle
allprojects {
    repositories {
        jcenter()
        maven { url "https://jitpack.io" }
    }
}

dependencies {
    compile 'com.github.Vaycent:volleysharp:1.5.0'
}

```

New a VolleySharp object in your project. Be noticed, please instance only one VolleySharp object in the whole project, for example, you can new this VolleySharp object in Application.

```java
VolleySharp volleySharp = new VolleySharp(this);
```

This function can help you to implement the http get request


```java
StringListenerInterface listenerInterface;
        listenerInterface=new StringListenerInterface(context, StringListenerInterface.responseListener, StringListenerInterface.errorListener)
        {
            @Override
            public void responseAction(String response) {
                //Response code here
            }
            @Override
            public void errorAction(VolleyError error) {
                //Error code here
            }
        };

String link="https://vaycent.github.io/atom.xml";

volleySharp.startGetRequest(link,listenerInterface);

```

This function can help you to implement the http post request

```java
 StringListenerInterface listenerInterface;
        listenerInterface=new StringListenerInterface(context, StringListenerInterface.responseListener, StringListenerInterface.errorListener)
        {
            @Override
            public void responseAction(String response) {
            	//Response code here
            }
            @Override
            public void errorAction(VolleyError error) {
                //Error code here
            }
        };

        String link="http://dynamic.12306.cn/otsquery/query/queryRemanentTicketAction.do?method=queryststrainall";
        Map<String, String> map = new HashMap<String, String>();
        map.put("date", "2016-09-16");
        map.put("fromstation", "BJP");
        map.put("tostation", "SHH");
        map.put("starttime", "00:00--24:00");

volleySharp.startPostRequest(link,listenerInterface,map);


```

This function can help you to implement the http json request

```java
 JsonListenerInterface listenerInterface;
        listenerInterface=new JsonListenerInterface(context, JsonListenerInterface.responseListener, StringListenerInterface.errorListener)
        {
            @Override
            public void responseAction(String response) {
                //Response code here

            }
            @Override
            public void errorAction(VolleyError error) {
                //Error code here
            }
        };

String link="http://gc.ditu.aliyun.com/geocoding?a=%E5%B9%BF%E5%B7%9E%E5%B8%82";
        
volleySharp.startJsonRequest(link,listenerInterface);
```




## LICENSE
The source code is licensed under GPL v3. License is available [here](./LICENSE.txt)