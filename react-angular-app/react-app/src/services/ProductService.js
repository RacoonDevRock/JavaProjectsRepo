import axios from "axios";

const initProduct = [
    {
        id: 1,
        name: 'Monitor Pear 69',
        description: 'Monito pantalla plana yeah',
        price: 6969
    },
    {
        id: 2,
        name: 'Iphonr 34',
        description: 'Con una foto se te apaga el celular',
        price: 500
    }
];

const base_url = 'http://localhost:8080/products';

export const listProduct = () => {
    return initProduct;
};

export const findAll = async () => {
    try {
        const response = await axios.get(base_url);
        return response;
    } catch (error) {
        console.log(error);
    }
    return null;
};

export const create = async ({ name, description, price }) => {
    try {
        const response = await axios.post(base_url, {
            name,
            description,
            price,
        });
        return response;
    } catch (error) {
        console.log(error);
    }
    return undefined;
};

export const update = async ({ id, name, description, price }) => {
    try {
        const response = await axios.put(`${base_url}/${id}`, {
            name,
            description,
            price,
        });
        return response;
    } catch (error) {
        console.log(error);
    }
    return undefined;
};

export const remove = async (id) => {
    try {
        await axios.delete(`${base_url}/${id}`);
    } catch (error) {
        console.log(error);
    }
};