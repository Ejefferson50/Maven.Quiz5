package rocks.zipcode.io.quiz4.objectorientation;

/**
 * @author leon on 11/12/2018.
 */
public class StringAssembler {

    private Character delimeter;
    private String buildIt;
    private StringBuilder sbStatus;
    public StringAssembler(Character delimeter) {
        this.sbStatus = new StringBuilder();
        this.delimeter = delimeter;
        this.buildIt = "";
    }

    public StringAssembler append(String str) {

        this.sbStatus.append(str);
        this.sbStatus.append(this.delimeter);
        return this;
    }

    public String assemble() {
        this.sbStatus.setLength(this.sbStatus.length()-1);
        return this.sbStatus.toString();
    }
}
