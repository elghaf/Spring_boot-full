package chaineofresponsiblity.handler;

import chaineofresponsiblity.infrastructure.AddRequest;

public class RawTextHandler implements MyHttpAddReqHandler {

    @Override
    public void setNextHandler(MyHttpAddReqHandler next) {
    }

    @Override
    public String handle(AddRequest req) {
        StringBuilder sb = new StringBuilder();

        sb.append("RAW-TEXT format:\n");
        sb.append("a = " + req.getA() + ", b = " + req.getB() + " ==> a + b = " + (req.getA() + req.getB()) + "\n");

        return sb.toString();
    }
}
