
package pw.gike.gikeweibo.bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Insecurity_ {

    @SerializedName("sexual_content")
    @Expose
    private Boolean sexualContent;

    public Boolean getSexualContent() {
        return sexualContent;
    }

    public void setSexualContent(Boolean sexualContent) {
        this.sexualContent = sexualContent;
    }

}
