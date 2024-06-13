package edu.ucdavis.primate.barbary.operator.crd.module;

import edu.ucdavis.primate.barbary.operator.crd.CRDConstants;
import io.fabric8.kubernetes.api.model.Namespaced;
import io.fabric8.kubernetes.client.CustomResource;
import io.fabric8.kubernetes.model.annotation.Group;
import io.fabric8.kubernetes.model.annotation.Version;

@Group(CRDConstants.CRD_API_GROUP)
@Version(CRDConstants.CRD_API_VERSION_ALPHA_ONE)
public class Module extends CustomResource<ModuleSpec, ModuleStatus> implements Namespaced {
    public Module() {
    }
}
