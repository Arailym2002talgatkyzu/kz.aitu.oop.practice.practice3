public interface Programmer_member extends Member {
    //when object implements this interface then it also must implement Member interface
    String programs();
    int get_doing_duration();
    int getBonus();
    int getPenalty();
}
