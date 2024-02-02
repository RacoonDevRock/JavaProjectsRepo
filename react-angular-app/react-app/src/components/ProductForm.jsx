import { useEffect, useState } from "react";

const initialDataForm = {
    id: 0,
    name: '',
    description: '',
    price: '',
}

// eslint-disable-next-line react/prop-types
export const ProductForm = ({ productSelected, handlerAdd }) => {

    const [form, setForm] = useState(initialDataForm);
    const { name, description, price } = form;

    useEffect(() => {
        setForm(productSelected);
    }, [productSelected]);

    return (
        <>
            <form onSubmit={(event => {
                event.preventDefault();

                if (!name || !description || !price) {
                    alert('Debe completar los datos del formulario');
                    return;
                }

                // console.log(form);
                handlerAdd(form);
                setForm(initialDataForm);
            })}>
                <div>
                    <input style={{ 'marginBottom': '4px' }} type="text" placeholder="Name" name="name" value={name} onChange={(event => setForm({
                        ...form, name: event.target.value
                    }))} />
                </div>
                <div>
                    <input style={{ 'marginBottom': '4px' }} type="text" placeholder="Description" name="description" value={description} onChange={(event => setForm({
                        ...form, description: event.target.value
                    }))} />
                </div>
                <div>
                    <input style={{ 'marginBottom': '4px' }} type="text" placeholder="Price" name="price" value={price} onChange={(event => setForm({
                        ...form, price: event.target.value
                    }))} />
                </div>
                <div>
                    <button type="submit">
                        Save
                    </button>
                </div>
            </form>
        </>
    )
};