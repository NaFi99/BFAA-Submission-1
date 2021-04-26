package com.example.githubuser

object DataUser {
    private val gitUser = arrayOf(
        "Elon Musk", "Mark Zuckerberg",
        "Bill Gates", "Jeff Bezos", "Paul Allen",
        "Reid Hoffman", "Linus Torvalds",
        "Kevin Systrom", "Jack Dorsey", "Steve Jobs"
    )


    private val gitDesc = arrayOf(
        "Founder of Tesla", "Founder of Facebook",
        "Founder of Microsoft", "Founder of Amazon", "Co-Founder of Microsoft",
        "Founder of LinkedIn", "Founder of Linux",
        "Founder of Instagram", "Founder of Twitter", "Founder of Apple"
    )
    private val gitFollowers = arrayOf(
            "12 M", "9.9 M",
            "6.7 M", "5.5 M", "4.6 M",
            "7.1 M", "4.4 M",
            "4 M", "7.2 M", "10 M"
    )

    private val gitFollowing = arrayOf(
            "12 K", "9 K",
            "10 K", "5 K", "4.6 K",
            "3.1 K", "9.4 K",
            "5.1 K", "3.2 K", "9.1 K"
    )

    private val gitAddress = arrayOf(
            "Palo Alto, CA 94304", "Headquarters 1 Hacker Way Menlo Park, CA 94025",
            "Way Redmond, WA 98052-6399 USA", "Terry Avenue North Seattle, WA 98109 USA",
            "Way Redmond, WA 98052-6399 USA", "Sunnyvale, CA", "San Francisco, California 94104-5401 USA",
            "Menlo Park, CA", "1355 Market Street, San Francisco, California", "Cupertino, California, United States"
    )

    private val gitLogo = intArrayOf(
            R.drawable.tesla,
            R.drawable.facebook,
            R.drawable.microsoft,
            R.drawable.amazon,
            R.drawable.microsoft,
            R.drawable.linkedin,
            R.drawable.linux,
            R.drawable.instagram,
            R.drawable.twitter,
            R.drawable.apple
    )

    private val gitPhoto = intArrayOf(
        R.drawable.elonmusk,
        R.drawable.markzuck,
        R.drawable.billgates,
        R.drawable.jeffbezos,
        R.drawable.paulallen,
        R.drawable.reidhoffman,
        R.drawable.linustorvalds,
        R.drawable.kevinsystrom,
        R.drawable.jackdorsey,
        R.drawable.stevejobs
    )
    val listData: ArrayList<User>
        get(){
            val list = arrayListOf<User>()
            for (position in gitUser.indices) {
                val user = User()
                user.name = gitUser[position]
                user.description = gitDesc[position]
                user.followers = gitFollowers[position]
                user.following = gitFollowing[position]
                user.address = gitAddress[position]
                user.logo = gitLogo[position]
                user.photo = gitPhoto[position]

                list.add(user)
            }
            return list
        }
}
