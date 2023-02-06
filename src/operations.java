class operations {
    public boolean not(boolean p){
        return (!p);
    }

    public boolean and(boolean p, boolean q){
        return p&&q;
    }

    public boolean or(boolean p, boolean q) {
        return p||q;
    }

    public boolean exOr(boolean p, boolean q){

        return (p!=q);
    }

    public boolean nand(boolean p, boolean q){
        return !(p&&q);
    }

    public boolean nor(boolean p, boolean q){
        return !(p||q);
    }

    public boolean then(boolean p, boolean q){
        if (p == true && q == false){
            return false;
    }   return true;}

    public boolean biCon(boolean p, boolean q){
        return (p == q);
    }
}
