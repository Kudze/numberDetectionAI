package kudze.machineLearning.layout.neuron;

/**
 * Created by Kudze on 10/21/2018.
 * <p>
 * All Rights Reserved by L5 Corp.
 */
public class NeuronInput {

    private NeuronInterface neuron;
    private float weight;

    public NeuronInput(NeuronInterface neuron, float weight) {
        this.neuron = neuron;
        this.weight = weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return this.weight;
    }

    public NeuronInterface getNeuron() {
        return neuron;
    }

}
