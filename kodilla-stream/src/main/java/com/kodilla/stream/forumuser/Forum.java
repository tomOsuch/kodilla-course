package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> theForumUsersList = new ArrayList<>();

    public Forum() {
        theForumUsersList.add(new ForumUser(1, "jkowalski", 'M', 1988, 5, 19, 170));
        theForumUsersList.add(new ForumUser(2, "jpiotrkowicz", 'M', 1988, 5, 19, 0));
        theForumUsersList.add(new ForumUser(3, "jkowalski", 'M', 1988, 3, 19, 179));
        theForumUsersList.add(new ForumUser(4, "jkowalski", 'F', 1988, 3, 19, 170));
        theForumUsersList.add(new ForumUser(5, "jpiotrkowicz", 'M', 1988, 3, 19, 1));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theForumUsersList);
    }
}
