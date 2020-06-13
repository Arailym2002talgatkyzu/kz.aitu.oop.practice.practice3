public interface Nonprogrammer_member extends Member{
    //when object implements this interface then it also must implement Member interface
    String manage();
    void setDoingDuration(int day);
    void setPenalty(int penalty);
    void setBonus(int bonus);

}
