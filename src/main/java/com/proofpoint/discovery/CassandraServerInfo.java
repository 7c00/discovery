package com.proofpoint.discovery;

public class CassandraServerInfo
{
    private final int rpcPort;

    public CassandraServerInfo(int rpcPort)
    {
        this.rpcPort = rpcPort;
    }

    public int getRpcPort()
    {
        return rpcPort;
    }
}
