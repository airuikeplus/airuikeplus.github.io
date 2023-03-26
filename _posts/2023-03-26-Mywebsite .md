---
layout: post
title: Record markdown
categories: study
tags: [record]
---





# 2023-03-26-Mywebsite .md



## 流程简述：

1. 首先，我们可以找官网的文件来告诉我们具体从哪一步开始，然而官方文档是室友帮我找的，今天复盘的时候不知道官方文件具体在哪，不过没关系，遇到不会的就可以==问AI——chatgtp==，昨天室友展示了一个更好用的poe-chatgpt

2. AI会告诉我们——==创建一个新的仓库==，仓库设置为公开（Public)，并添加README选项（似乎我是没点的，不过问题不大）

3. AI告诉我们：==上传你的网站文件==。将你的网站文件（例如HTML、CSS、JavaScript等文件）上传到新创建的仓库中。（他说到git，这个我们后面再讲）

4. 访问你的网站。在浏览器中输入“[你的用户名]==.github.io==”。（我直接给仓库取名叫xxx.github.io）

5. 使用主题点缀网页（涉及Jekyll和bundler）



## 实际操作和遇到的问题及解决方法

1. 找官方教程——><https://docs.github.com/en/pages/quickstart>

2. 在任何页面的右上角，点击“+”下拉菜单选择“新建存储库”:
   

   ![](https://docs.github.com/assets/cb-11427/images/help/repository/repo-create.png)

   

3. 输入 `username.github.io` 作为存储库名称。 将 `username` 替换为你的 GitHub 用户名:

   ![ ](https://docs.github.com/assets/cb-103896/images/help/pages/create-repository-name-pages.png)





4. ![image-20230326142224842](C:\Users\在劫难逃\AppData\Roaming\Typora\typora-user-images\image-20230326142224842.png)

5. 默认情况下，站点的标题为 `username.github.io`。 可通过编辑存储库中的==_“config.yml”文件==来更改标题。![image-20230326142659435](C:\Users\在劫难逃\AppData\Roaming\Typora\typora-user-images\image-20230326142659435.png)	

## 使用工具

* vs code：主题其实也是一堆文件，其中有.md形式和其它html、txt等等；VScode 就是用来对他们进行修改，我网站直接用的别人的主题，里面的内容复制下来，在VScode里面搜索并替换成我自己的内容（主题下好了，git不要，其它全复制覆盖到xxx.github.io文件下）
* GitHub desktop：修改以后提交，提交完成后返回GitHub，找到自己的仓库——>Action，本地更新，同步远端更新就可以更新自己网站了![image-20230326144329563](C:\Users\在劫难逃\AppData\Roaming\Typora\typora-user-images\image-20230326144329563.png)
* jekyll和bundler：功能不明确