package chaineofresponsiblity.infrastructure;

import chaineofresponsiblity.handler.JSONHandler;
import chaineofresponsiblity.handler.MyHttpAddReqHandler;
import chaineofresponsiblity.handler.RawTextHandler;
import chaineofresponsiblity.handler.XMLHandler;

public class WebService {
    private MyHttpAddReqHandler myChainOfHandlers;

    public WebService() {

        // creating and chaining handlers
        RawTextHandler myRawHandler = new RawTextHandler();
        XMLHandler myXmlHandler = new XMLHandler(myRawHandler);
        JSONHandler myJsonHandler = new JSONHandler(myXmlHandler);

        this.myChainOfHandlers = myJsonHandler;
    }

    public WebService(MyHttpAddReqHandler chain) {
        this.myChainOfHandlers = chain;
    }

    public String handleRequest(AddRequest addReq) {
        return myChainOfHandlers.handle(addReq);
    }
}
