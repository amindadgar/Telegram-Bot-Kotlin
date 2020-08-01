import org.telegram.telegrambots.ApiContextInitializer
import org.telegram.telegrambots.meta.TelegramBotsApi
import org.telegram.telegrambots.meta.exceptions.TelegramApiException

fun main(){
        ApiContextInitializer.init()
        val telApi = TelegramBotsApi()

        try {

            telApi.registerBot(SampleBot())

        }catch (ex:TelegramApiException){
            ex.printStackTrace()
        }
}