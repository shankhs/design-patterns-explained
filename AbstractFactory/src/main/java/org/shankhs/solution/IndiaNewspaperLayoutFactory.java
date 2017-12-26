package org.shankhs.solution;

public class IndiaNewspaperLayoutFactory implements LayoutFactory {
    public FrontPageLayout createFrontPageLayout() {
        return new IndiaFrontPageLayout();
    }

    public PoliticsPageLayout createPoliticsPageLayout() {
        return new IndiaPoliticsPageLayout();
    }
}
