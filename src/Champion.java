public class Champion {
    private int Id;
    private String Name,
                   Role,
                   Difficulty,
                   BgArt,
                   Description;

    public Champion(int id, String name, String role, String difficulty, String bgArt,String description){
        this.Id = id;
        this.Name = name;
        this.Role = role;
        this.Difficulty = difficulty;
        this.BgArt = bgArt;
        this.Description = description;
    }

    public int getId(){  return Id;  }
    public String getName(){    return Name;   }
    public String getRole(){    return Role;   }
    public String getDifficulty() {    return Difficulty;    }
    public String getBgArt(){   return BgArt;    }
    public String getDescription() {    return Description;   }

    public boolean setId(int id){
        if (id > 0){
            this.Id = id;
            return true;
        }else
            return false;
    }

    public boolean setName (String name){
        if (!name.isEmpty()){
            this.Name = name;
            return true;
        }else
            return false;
    }

    public boolean setRole (String role){
        if (!role.isEmpty()){
            this.Role = role;
            return true;
        }else
            return false;
    }

    public boolean setDifficulty(String difficulty){
        if (!difficulty.isEmpty()){
            this.Difficulty = difficulty;
            return true;
        }else
            return false;
    }

    public boolean setDescription(String description){
        if (!description.isEmpty()){
            this.Description = description;
            return true;
        }else
            return false;
    }
    public boolean setBgArt(String bgArt){
        if (!bgArt.isEmpty()){
            this.BgArt = bgArt;
            return true;
        }else
            return false;
    }

    public String showDescription() {
        return
                "\n" + Description +
                "\nRole: " + Role +
                        "\nId: " + Id +
                        "\nDifficulty: " + Difficulty +"\n";

    }
}
