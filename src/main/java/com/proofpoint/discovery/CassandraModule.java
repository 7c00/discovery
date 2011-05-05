package com.proofpoint.discovery;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.Scopes;
import com.proofpoint.configuration.ConfigurationModule;

public class CassandraModule
    implements Module
{
    @Override
    public void configure(Binder binder)
    {
        ConfigurationModule.bindConfig(binder).to(CassandraServerConfig.class);
        binder.bind(CassandraServerInfo.class).toProvider(CassandraServerInfoProvider.class).in(Scopes.SINGLETON);
        binder.bind(EmbeddedCassandraServer.class).in(Scopes.SINGLETON);
    }
}
