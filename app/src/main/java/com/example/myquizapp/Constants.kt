package com.example.myquizapp

object Constants {
    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina","Australia",
            "Armenia","Armenia",
            1
        )
        questionsList.add(que1)

        // 2
        val que2 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "United Kingdom","Jordan",
            "New Zealand","Sudan",
            3
        )
        questionsList.add(que2)

        // 3
        val que3 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Germany","Netherlands",
            "Luxembourg","Belgium",
            4
        )
        questionsList.add(que3)

        // 4
        val que4 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Nauru","Fiji",
            "Micronesia","Kiribati",
            2
        )
        questionsList.add(que4)

        // 5
        val que5 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Colombia","Ecuador",
            "Brazil","Paraguay",
            3
        )
        questionsList.add(que5)

        // 6
        val que6 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait","Iraq",
            "Togo","Somalia",
            1
        )
        questionsList.add(que6)

        // 7
        val que7 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Denmark","Finland",
            "Norway","Sweden",
            1
        )
        questionsList.add(que7)

        // 8
        val que8 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "Ivory Coast","Italy",
            "Niger","India",
            4
        )
        questionsList.add(que8)

        // 9
        val que9 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Belgium","Germany",
            "Austria","Switzerland",
            2
        )
        questionsList.add(que9)

        return questionsList
    }
}