package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> listOfUsers = new ArrayList<>();

    public Forum(){
        listOfUsers.add(new ForumUser(1292,"Cyk10n3 Sw0rd",'M', LocalDate.of(1992,1,14),894));
        listOfUsers.add(new ForumUser(1492,"skYforce",'F', LocalDate.of(1990,04,10),152));
        listOfUsers.add(new ForumUser(1599,"Rom!o",'M', LocalDate.of(2002,10,22),187));
        listOfUsers.add(new ForumUser(2130,"Blair_witcH",'F', LocalDate.of(1984,2, 03),341));
        listOfUsers.add(new ForumUser(1663,"iDieInMyDreams",'F', LocalDate.of(1997,12,19),210));
        listOfUsers.add(new ForumUser(1297,"Fr0sty",'M', LocalDate.of(1982,3,27),522));
        listOfUsers.add(new ForumUser(1317,"D4RK WHIT3",'M', LocalDate.of(1995,8,29),427));
    }
    public List<ForumUser>getUsersList(){
        return new ArrayList<>(listOfUsers);
    }
}

