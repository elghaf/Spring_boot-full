package chaineofresponsiblity.handler;

import chaineofresponsiblity.infrastructure.AddRequest;

public interface MyHttpAddReqHandler {
    void setNextHandler(MyHttpAddReqHandler next);
    String handle (AddRequest req);
}
