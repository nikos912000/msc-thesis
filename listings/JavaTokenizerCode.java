{
    int page;
    long sinceId;
    int count;
    Paging paging = new Paging(page, count);
    if (sinceId > 0) {
        paging.setSinceId(sinceId);
    }
}