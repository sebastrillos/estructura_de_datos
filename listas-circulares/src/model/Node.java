package model;

public class Node {
    private Contact fact;
    private Node following;

    public Node(Contact fact) {
        this.fact = fact;
    }

    public Contact getFact() {
        return fact;
    }

    public void setFact(Contact fact) {
        this.fact = fact;
    }

    public Node getFollowing() {
        return following;
    }

    public void setFollowing(Node following) {
        this.following = following;
    }


}
