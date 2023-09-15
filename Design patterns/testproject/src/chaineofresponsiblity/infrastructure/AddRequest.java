package chaineofresponsiblity.infrastructure;

public class AddRequest {
    private Integer a;
    private Integer b;
    private MediaType desiredMediaType;

    /* Creation de constuctor */
    public AddRequest(Integer a, Integer b, MediaType desiredMediaType) {
        this.a = a;
        this.b = b;
        this.desiredMediaType = desiredMediaType;

    }

    public MediaType getDesiredMediaType() {
        return desiredMediaType;
    }

    public void setDesiredMediaType(MediaType diredMediaType) {
        this.desiredMediaType = diredMediaType;
    }

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }

    public String handle() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'handle'");
    }
}
