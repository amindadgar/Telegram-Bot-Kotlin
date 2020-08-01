import org.telegram.telegrambots.bots.TelegramLongPollingBot
import org.telegram.telegrambots.meta.api.objects.Update

class SampleBot: TelegramLongPollingBot() {

    override fun getBotUsername(): String {
        return "AminSampleBot"
    }

    override fun getBotToken(): String {
        return "1296110627:AAHFrWr8qWMP7G9mupdLTgqBMpGQL6CsU6M"
    }

    override fun onUpdateReceived(update: Update?) {
        println(update!!.message.text)
    }




}