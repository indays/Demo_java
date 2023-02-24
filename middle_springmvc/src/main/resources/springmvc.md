![img.png](img.png)


1:用户请求 
2：dispatcherServlet 拦截用户请求， 映射处理器HandlerMapping,获取对应的Handler处理器
3：根据Handler处理器调用处理器适配器，调用处理器及方法，返回VeiwAndModel
4:disPathcerServlet 调用视图解析
5：disPathcherServlet 调用视图渲染
