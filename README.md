# Telegram-Bot-Kotlin

[![N|telegram](https://img.icons8.com/fluent/48/000000/telegram-app.png)](https://core.telegram.org/bots)
[![Open Source Love svg2](https://badges.frapsoft.com/os/v2/open-source.svg?v=103)](https://github.com/ellerbrock/open-source-badges/)




since there are no kotlin tutorial for creating telegram bot in kotlin, So I started to make this simple tutorial for bulding a very simple bot in kotlin language.
Let's get started :)
### How to create a telegram bot in Kotlin language ?
here's what you need to start:
  - A suitable IDE (IntelliJ IDEA prefered)
  - Stable internet connection
  - A Telegram token Api __

 

### So Let's get started !

#### At first Create a Kotlin Project in Intellij.
![creating proejct](https://github.com/amindadgar/Telegram-Bot-Kotlin/blob/master/Photo%201.jpg)
![creating proejct](https://github.com/amindadgar/Telegram-Bot-Kotlin/blob/master/Photo%202.jpg)
#### then when the project created right click on it and click on add framework support.
![add framework support](https://github.com/amindadgar/Telegram-Bot-Kotlin/blob/master/Photo%203.jpg)

#### add telegram bots dependencies in the _**pom.xml**_
```
<dependency>
        <groupId>org.telegram</groupId>
        <artifactId>telegrambots</artifactId>
        <version>4.9</version>
    </dependency>
```
#### then click on the right corner to open the maven tab (higlighted in red)
after that click on the refresh button to download the dependencies (higligted in yellow)
![download dependencies](https://github.com/amindadgar/Telegram-Bot-Kotlin/blob/master/InkedPhoto%204_LI.jpg)

#### make a class for your bot main work and inharit the **TelegramLongPollingBot()** function
[just like me in this code](https://github.com/amindadgar/Telegram-Bot-Kotlin/blob/master/src/main/java/SampleBot.kt)

after that impelement members (ide will implement them in suggestions) 

![implement members](https://github.com/amindadgar/Telegram-Bot-Kotlin/blob/master/implement%20members.jpg)

#### Go to telegram and search for botFather
![BotFather](https://github.com/amindadgar/Telegram-Bot-Kotlin/blob/master/botFather.jpg)

create new bot and copy token access

#### paste the access token in the return of **getBotToken()** function
write your bot's name in the return of **getBotUsername()** either.

#### create a function name it main
put this codes in main function
```
ApiContextInitializer.init()
        val telApi = TelegramBotsApi()

        try {

            telApi.registerBot(SampleBot())

        }catch (ex:TelegramApiException){
            ex.printStackTrace()
        }
```
! SampleBot is main class for our bot work, if you named it another put that name there.

#### to print the text entered in your bot write **onUpdateReceived** function like this.
```
 override fun onUpdateReceived(update: Update?) {
        println(update!!.message.text)
    }
```

### Well done!
your work is finished!
run your code to then message your bot then you'll see your messages will be printed in console :smiley: .


### Links & References
#### official telegram website have useful information for it's bots: 
[Bots: An introduction for developers](https://core.telegram.org/bots)

[Click to see Bots usage in other languages](https://core.telegram.org/bots/samples)



### Issues
if you have any problems just post you issues in the issue tab of this project, I'll help you with that :wink:






