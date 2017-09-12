# IncrementalUpdate
这是一套完整的增量更新解决方案的demo，包括服务端和客服端（java、android和c/c++代码）。

1、服务端：IncrementalUpdateServer文件夹下面，是一个标准的java工程，打开工程修改apk路径，直接运行即可生成增量包。
2、客服端：IncrementalUpdate文件夹下面，是标准的as工程，直接导入，修改增量包路径。运行->点击按钮，即可生成完整的安装包。
3、BsDiff文件夹是标准的vs工程，演示了bsdiff的Windows下编译，Linux下编译需稍作修改即可。