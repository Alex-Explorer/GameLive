public enum Status {
    NONE,
    BORN,
    LIVE,
    DIED;

    public Status step1 (int around)
    {
        switch (this)
        {
            case NONE : return (around ==3) ? BORN : LIVE;
            case LIVE: return (around <= 1 || around >= 4) ? DIED : LIVE;
            default : return this;
        }
    }

    public Status step2()
    {
        switch (this)
        {
            case BORN : return LIVE;
            case DIED : return NONE;
            default : return this;
        }
    }
}