package cn.bugstack.chatbot.api.domain.zsxq.model.vo;
public class Latest_likes
{
    private String create_time;

    private Owner owner;

    public void setCreate_time(String create_time){
        this.create_time = create_time;
    }
    public String getCreate_time(){
        return this.create_time;
    }
    public void setOwner(Owner owner){
        this.owner = owner;
    }
    public Owner getOwner(){
        return this.owner;
    }
}