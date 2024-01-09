#secondkill
## demo-nginx 
###此项目主要是用 Lua 语言开发
- config 文件夹是用来存放一些常用配置的，像一些常量配置和负载均衡配置等
- domain 文件夹主要是用来存放“HTTP 配置”中的 server 模块配置文件
- lua 文件夹则主要用来存放用 Lua 语言编写的业务逻辑代码文件
## demo-support
###操作数据库入口
- support-common：存放一些基本的工具方法或者常量等。

- demo-support-dao：持久层，主要存放数据库相关的 SQL 文件、实体、操作方法。
- demo-support-export：对外接口定义层，主要定义提供的 RPC 接口方法以及实体等。
- demo-support-service：业务逻辑层。
- demo-support-launcher：项目文件配置、监控、拦截器等，同时也是打包部署 module。
## demo-vertx-web
###此项目用于demo-web项目的优化项目
vertx 网关
- demo-vertx-gateway 模块用来做一些文件的配置，并且也是用来打包部署的
- demo-vertx-service 主要用来做业务聚合（拷贝demo-web 中的 service 模块代码）
## demo-web
- demo-gateway 主要负责对外 HTTP 接口定义，以及 SpringMVC 相关文件配置，并且也是要打包部署的 module；
- demo-service 主要用来做业务逻辑处理；
- demo-common 用来放一些公用方法或者工具类等
