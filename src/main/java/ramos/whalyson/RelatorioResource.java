package ramos.whalyson;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/relatorio")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RelatorioResource {
    @Inject
    Config config;

    @GET
    public Config getConfig() {

        return config;
    }

    @PUT
    public void updateConfig(Config newConfig){
        this.config = newConfig;
        //config.setFormatoRelatorio(newConfig.getFormatoRelatorio());
        //config.setTipoGrafico(newConfig.getTipoGrafico());
    }
}
