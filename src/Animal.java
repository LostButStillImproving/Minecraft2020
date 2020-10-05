public interface Animal {
    default String getGender(){
        return this.getGender();
    }
    default void sound(){
        this.sound();
    }
}


