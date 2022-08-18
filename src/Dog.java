// Dog

class Dog {
    private String Name;

    public void SetName( String nm ) {
        Name = nm;
    }

    private int Age;

    public void SetAge( int ag ) {
        Age = ag;
    }

    private String Breed;

    public Dog( String brd ) {
        Breed = brd;
    }

    public void ShowProfile() {
        System.out.println( "犬種は、" + Breed + "、" + "名前は、" + Name + "、" + "年齢は、" + Age + "歳です。" );
    }

}
