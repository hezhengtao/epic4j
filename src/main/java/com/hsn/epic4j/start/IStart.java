package com.hsn.epic4j.start;

import com.hsn.epic4j.bean.Item;
import com.ruiyun.jvppeteer.core.browser.Browser;
import com.ruiyun.jvppeteer.core.page.Page;
import lombok.SneakyThrows;

import java.util.List;

public interface IStart {
    /**
     * 获取浏览器
     */
    Browser getBrowser();

    /**
     * 获取默认页面
     */
    Page getDefaultPage(Browser browser);

    void crawlerTest(Page page);

    @SneakyThrows
    boolean needLogin(Browser browser);

    /**
     * 领取游戏
     * @return
     */
    List<Item> receive(Page page);
}
