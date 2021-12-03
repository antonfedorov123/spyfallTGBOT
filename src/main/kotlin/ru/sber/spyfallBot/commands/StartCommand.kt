package ru.sber.spyfallBot.commands

import org.springframework.stereotype.Component
import org.telegram.telegrambots.meta.api.objects.Chat
import org.telegram.telegrambots.meta.api.objects.User
import org.telegram.telegrambots.meta.bots.AbsSender
import ru.sber.spyfallBot.enums.Command

@Component
class StartCommand: AbstractCommand(Command.START) {

    override fun execute(absSender: AbsSender, user: User, chat: Chat, arguments: Array<out String>) {
        val userFullName = "${user.firstName} ${user.lastName}"
        sendEvent(chat.id, arrayOf(userFullName))
    }
}