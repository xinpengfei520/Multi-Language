# Multi-Language

Multi-Language is supported many country language on Android.

## 1.多国语言文件夹命名对应表如下：

|国家|Folder Name|  
| ------ | ------ |  
|中文（中国）|values-zh-rCN|  
|中文（台湾）|values-zh-rTW|  
|中文（香港）|values-zh-rHK|  
|英语（美国）|values-en-rUS|  
|英语（英国）|values-en-rGB|  
|英文（澳大利亚）|values-en-rAU|  
|英文（加拿大）|values-en-rCA|  
|英文（爱尔兰）|values-en-rIE|  
|英文（印度）|values-en-rIN|  
|英文（新西兰）|values-en-rNZ|  
|英文（新加坡）|values-en-rSG|  
|英文（南非）|values-en-rZA|  
|阿拉伯文（埃及）|values-ar-rEG|  
|阿拉伯文（以色列）|values-ar-rIL|  
|保加利亚文|values-bg-rBG|  
|加泰罗尼亚文|values-ca-rES|  
|捷克文|values-cs-rCZ|  
|丹麦文|values-da-rDK|  
|德文（奥地利）|values-de-rAT|  
|德文（瑞士）|values-de-rCH|  
|德文（德国）|values-de-rDE|  
|德文（列支敦士登）|values-de-rLI|  
|希腊文|values-el-rGR|  
|西班牙文（西班牙）|values-es-rES|  
|西班牙文（美国）|values-es-rUS|  
|芬兰文（芬兰）|values-fi-rFI|  
|法文（比利时）|values-fr-rBE|  
|法文（加拿大）|values-fr-rCA|  
|法文（瑞士）|values-fr-rCH|  
|法文（法国）|values-fr-rFR|  
|希伯来文|values-iw-rIL|  
|印地文|values-hi-rIN|  
|克罗里亚文|values-hr-rHR|  
|匈牙利文|values-hu-rHU|  
|印度尼西亚文|values-in-rID|  
|意大利文（瑞士）|values-it-rCH|  
|意大利文（意大利）|values-it-rIT|  
|日文|values-ja-rJP|  
|韩文|values-ko-rKR|  
|立陶宛文|valueslt-rLT|  
|拉脱维亚文|values-lv-rLV|  
|挪威博克马尔文|values-nb-rNO|  
|荷兰文(比利时)|values-nl-BE|  
|荷兰文（荷兰）|values-nl-rNL|  
|波兰文|values-pl-rPL|  
|葡萄牙文（巴西）|values-pt-rBR|  
|葡萄牙文（葡萄牙）|values-pt-rPT|  
|罗马尼亚文|values-ro-rRO|  
|俄文|values-ru-rRU|  
|斯洛伐克文|values-sk-rSK|  
|斯洛文尼亚文|values-sl-rSI|  
|塞尔维亚文|values-sr-rRS|  
|瑞典文|values-sv-rSE|  
|泰文|values-th-rTH|  
|塔加洛语|values-tl-rPH|  
|土耳其文|values--r-rTR|  
|乌克兰文|values-uk-rUA|  
|越南文|values-vi-rVN|  


## 2.常见的一些坑

 - 设置英文语言时在有些手机上不起作用
   在开发过程中我们试过在Redmi Note 4手机上设置英语语言不起作用，这是由于有些手机厂商的默认英语设置的是英式英语，而我们只使用了美式英语的缘故，此时处理方式为：①设置两种英语的设置选项，即美式英语和英式英语；②可将res的文件夹命名为**values-en**即可，不区分英式英语和美式英语即可；
 - 在Android Studio3.0之前，如果有些strings没有对应到其他的语种，即有些字段没有翻译过来，打包时会       报警告，可以打成包，而3.0之后是不可以的，会打包失败，所以每个Strings必须对应一套完整的翻译！